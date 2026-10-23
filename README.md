# Java Log Parser

A lightweight, automated utility script written in Java designed to scan server system logs and immediately identify critical errors. This project demonstrates practical proficiency with Java file I/O operations, string manipulation, and exception handling.

## Features
* **Automated Log Scanning:** Uses `BufferedReader` for efficient, line-by-line reading of raw text files, mimicking real-world server log analysis.
* **Keyword Detection:** Dynamically searches string arrays for `ERROR` flags and isolates the exact timestamp and system message associated with the failure.
* **Exception Handling:** Implements `try-catch` resource blocks to safely handle `IOException` errors if the target log file is missing or corrupted.

## How to Run
1. Clone this repository to your local machine.
2. Ensure the `server_log.txt` file is located in the root directory.
3. Compile the Java script:
   ```bash
   javac thejavalogparserscript/LogParser.java
