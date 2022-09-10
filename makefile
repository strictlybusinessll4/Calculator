JFLAGS = -g 
JC = javac


.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

#make sure they are tabs

CLASSES = \
	Add.java \
	Calcdriver.java \
	Calculator.java \
	Operation.java \
	Subtract.java  

default: classes


classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
