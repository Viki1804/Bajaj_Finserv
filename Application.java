@SpringBootApplication
@EnableRetry
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner run(TaskService taskService) {
        return args -> taskService.processStartupTask();
    }
}
