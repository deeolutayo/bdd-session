require 'rspec'
require 'java'
 
$CLASSPATH << File.expand_path('.') + "/bin/"
java_import Java::bdd.Book
java_import Java::bdd.Library
java_import Java::bdd.User