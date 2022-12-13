# Reproducing repo for QD-4684

https://youtrack.jetbrains.com/issue/QD-4684

This is working correctly with `./gradlew :foo:bootRun`
```
 ❯❯ curl localhost:8080/hello
Hello QD-4684%
```

## Structure

This repo has 2 modules; `foo` and `bar`.
`foo` depends `bar`, also we wrote `spring.config.import` with `classpath:` prefix
that includes application-bar.yaml located in module `bar`. 

```yaml
spring:
  config:
    import:
      - classpath:application-bar.yaml
```

However, Qodana reports `Cannot resolve file 'application-bar.yml'`.
