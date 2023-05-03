# Using

Navigate to `src/main/java`, then:

- Compile `RMIServer` and the required dependencies with:

```bash
"%JDK_11%\bin\javac.exe" dev\vini2003\calculadora\RMIServer.java
```

Replace `%JDK_11%` with the path to your JDK 11 installation.

- Then, run `rmiregistry.exe` with:

```bash
"%JDK_11%\bin\rmiregistry.exe"
```

You may now execute `RMIServer` and it should work.