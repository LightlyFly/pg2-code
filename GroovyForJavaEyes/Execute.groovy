println "svn help".execute().text

println "svn help".execute().getClass().name

println "groovy -v".execute().text

// on linux
println "ls -l".execute().text