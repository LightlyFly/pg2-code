class Calibrator {
    Calibrator(calculationBlock) {
        print "using..."
        calculationBlock()
    }
}

//def calibrator = new Calibrator() {
//    println "the calculation provided"
//}

def caclibrator1 = new Calibrator({
    println "the calculation provided"
})
def calculation = { println "another calculation provided" }
def calculation2 = new Calibrator(calculation)