package com.richluong.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    /*
    Gives the s3 client to use
    Available to inject and store any files
     */
    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                "AKIAQJ7DE6G6UOPQIJHH",
                "zstPQgGAwFweg0Qf0ol6xUqUn4DnY8dFB4xXU6cr"
        );

        return AmazonS3ClientBuilder
                .standard()
                .withRegion("us-east-1")
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
