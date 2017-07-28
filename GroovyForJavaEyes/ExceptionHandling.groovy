def openFile(fileName) {
    new FileInputStream(fileName)
}

// catch file not found exception
try {
    openFile("noexistentfile")
} catch(FileNotFoundException ex) {
    println "Oops: " + ex
}

// catch all exceptions
try {
    openFile("noexistentfile")
} catch(ex) {
    println "Oops: " + ex
}