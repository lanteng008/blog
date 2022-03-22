package com.lt;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.io.File;
import java.util.Collections;

/**
 * @description:
 * @author: lt
 * @date: Created in 2022/3/22 14:40
 * @version:
 * @modified By:
 */
public class CodeGenerator {

    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();

        // 全局配置
        GlobalConfig config = new GlobalConfig();
        String projectPath = System.getProperty("user.dir")+ File.separator + "blog-generator" + File.separator + "generator-output";
        // 设置输出到的目录
//        config.setOutputDir(projectPath + "/src/main/java");
        config.setOutputDir(projectPath );
        config.setAuthor("lt");
        // 生成结束后是否打开文件夹
        config.setOpen(false);

        // 全局配置添加到 generator 上
        generator.setGlobalConfig(config);

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setUrl("jdbc:mysql://119.8.183.233:3306/wallet_block?serverTimezone=Asia/Shanghai");
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/dblog?serverTimezone=Asia/Shanghai");

        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
//        dataSourceConfig.setPassword("hzxwallet20210728~!@#");
        dataSourceConfig.setPassword("5858688");
        // 数据源配置添加到 generator
        generator.setDataSource(dataSourceConfig);

        // 包配置, 生成的代码放在哪个包下
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.lt.blog");

        // 包配置添加到 generator
        generator.setPackageInfo(packageConfig);

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        // 下划线驼峰命名转换
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        // 开启lombok
        strategyConfig.setEntityLombokModel(true);
        // 开启RestController
        strategyConfig.setRestControllerStyle(true);
        generator.setStrategy(strategyConfig);
        generator.setTemplateEngine(new FreemarkerTemplateEngine());

        // 开始生成
        generator.execute();

    }
}
