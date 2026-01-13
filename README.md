# Hytale Template Plugin

![Java Version](https://img.shields.io/badge/Java-25-orange)
![Gradle](https://img.shields.io/badge/Gradle-8.14-blue)
![License](https://img.shields.io/badge/License-MIT-green)

A clean, modern template for creating **Hytale Server Plugins** using **Java 25** and **Gradle (Kotlin DSL)**.  
Designed to get you up and running in seconds with pre-configured build tasks, shadow jar support, and VS Code integration.

---

## 🚀 Features

- **☕ Java 25 Ready**: Pre-configured toolchain support. Gradle will automatically download JDK 25 if you don't have it.
- **🐘 Gradle Kotlin DSL**: Modern build scripts (`build.gradle.kts`) for better type safety and IDE autocompletion.
- **📦 Shadow Jar**: Automatically bundles dependencies (like Gson) to prevent runtime conflicts.
- **💻 VS Code Support**: Includes `.vscode/tasks.json` for one-click building.
- **🛠️ Auto-Deployment**: The `copyJar` task automatically deploys your plugin to the server's `mods` folder after building.

## 🛠️ Getting Started

### Prerequisites

*   **Java 25 JDK** (Optional - Gradle will auto-provision this).
*   A **Hytale Server** installation.

### 📥 Installation

1.  **Clone or Download** this repository.
    ```bash
    git clone https://github.com/yourusername/BasicHytalePlugin.git
    ```
2.  Open the project in your preferred IDE (IntelliJ IDEA or VS Code recommended).

### ⚙️ Configuration (Important!)

Before building, you **must** configure your local environment.

1.  Open the `gradle.properties` file in the root directory.
2.  Locate the `serverDir` property.
3.  Replace the placeholder `<serverDir>` with the **absolute path** to your Hytale Server directory.

    **Example:**
    ```properties
    # gradle.properties
    serverDir=C:/Users/Steve/Hytale/Server
    ```

    > **Note:** Ensure you use forward slashes `/` or escaped backslashes `\\` in the path.

4.  Optionally, update the plugin metadata:
    ```properties
    pluginGroup=com.yourname
    pluginVersion=1.0.0
    pluginDescription=My awesome Hytale plugin
    ```

## 🏗️ Building and Running

### Using VS Code
This project comes with pre-configured tasks.
*   Press **`Ctrl + Shift + B`** to build and deploy.

### Using Command Line
*   **Build & Deploy:**
    ```bash
    ./gradlew build
    ```
    (On Windows use `.\gradlew.bat build`)

The compiled and shadowed JAR keys will be generated in `build/libs` and automatically copied to your server's `mods` directory (as defined in `serverDir`).

## 📂 Project Structure

```plaintext
BasicHytalePlugin/
├── src/
│   ├── main/
│   │   ├── java/         # Source code
│   │   └── resources/    # manifest.json
├── .vscode/              # VS Code tasks
├── build.gradle.kts      # Build configuration
├── gradle.properties     # Project properties
└── settings.gradle.kts   # Project settings & plugins
```

## 🧩 Customization

*   **Renaming the Plugin**: Change `rootProject.name` in `settings.gradle.kts` and the `name` property in `gradle.properties`.
*   **Adding Dependencies**: Add standard Maven dependencies in `build.gradle.kts`:
    ```kotlin
    dependencies {
        implementation("com.google.guava:guava:32.1.2-jre")
    }
    ```

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
