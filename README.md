[![license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

# Dwalin REST Assured Maven Template Project

This repository serves as a starting point for creating robust web automation projects in Java. The
template integrates powerful tools like REST Assured for API testing and the Allure Framework for
advanced reporting, all seamlessly tied together with the Dwalin library.

## Features

- **Dwalin Integration:** Leverage the power of Dwalin to create maintainable and efficient web automation tests.
- **REST Assured:** Test your REST APIs effortlessly with REST Assured.
- **Allure Framework:** Generate and serve detailed test reports using Allure.
- **Cross-Browser Testing:** Easily switch between different browsers, including Firefox and Chrome.

## Getting Started

To get started with this template, clone the repository and run the following commands:

```bash
./mvnw clean verify -Dselenide.browser=firefox
./mvnw allure:serve -Dallure.serve.port=8080
```

This command will:

- Clean and build the project.
- Run your automated tests.
- Serve the Allure report on port 8080.

## Learn More About Dwalin

Curious about Dwalin and how it can enhance your testing strategy? Check out the [official Dwalin
repository](https://github.com/EPadronU/dwalin) to learn more about its features and capabilities.

## License

This template, like Dwalin, is released under the [Apache License 2.0](LICENSE). Feel free to use,
modify, and distribute it as needed.
