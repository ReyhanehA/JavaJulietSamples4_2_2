/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE563_Unused_Variable__unused_value_StringBuilder_07.java
Label Definition File: CWE563_Unused_Variable__unused_value.label.xml
Template File: sources-sinks-07.tmpl.java
*/
/*
* @description
* CWE: 563 Unused Variable
* BadSource:  Initialize data
* GoodSource: Initialize and use data
* Sinks:
*    GoodSink: Use data
*    BadSink : re-initialize and use data
* Flow Variant: 07 Control flow: if(private_five==5) and if(private_five!=5)
*
* */

package testcases.CWE563_Unused_Variable;

import testcasesupport.*;

import javax.servlet.http.*;

public class CWE563_Unused_Variable__unused_value_StringBuilder_07 extends AbstractTestCase
{

    /* The variable below is not declared "final", but is never assigned
       any other value so a tool should be able to identify that reads of
       this will always give its initialized value. */
    private int private_five = 5;

    public void bad() throws Throwable
    {
        StringBuilder data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(private_five==5)
        {
            /* POTENTIAL FLAW: Initialize, but do not use data */
            data = new StringBuilder("Good");
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: Initialize and use data before it is overwritten */
            data = new StringBuilder("Good");

            IO.writeLine(data.toString());

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(private_five==5)
        {
            /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
            data = new StringBuilder("Reinitialize");
            IO.writeLine(data.toString());
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: Use data without over-writing its value */
            IO.writeLine(data.toString());

        }

    }

    /* goodG2B1() - use goodsource and badsink by changing first private_five==5 to private_five!=5 */
    private void goodG2B1() throws Throwable
    {
        StringBuilder data;
        /* INCIDENTAL: CWE 570 Statement is Always False */
        if(private_five!=5)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            /* POTENTIAL FLAW: Initialize, but do not use data */
            data = new StringBuilder("Good");
        }
        else {

            /* FIX: Initialize and use data before it is overwritten */
            data = new StringBuilder("Good");

            IO.writeLine(data.toString());

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(private_five==5)
        {
            /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
            data = new StringBuilder("Reinitialize");
            IO.writeLine(data.toString());
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: Use data without over-writing its value */
            IO.writeLine(data.toString());

        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    private void goodG2B2() throws Throwable
    {
        StringBuilder data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(private_five==5)
        {
            /* FIX: Initialize and use data before it is overwritten */
            data = new StringBuilder("Good");
            IO.writeLine(data.toString());
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* POTENTIAL FLAW: Initialize, but do not use data */
            data = new StringBuilder("Good");

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(private_five==5)
        {
            /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
            data = new StringBuilder("Reinitialize");
            IO.writeLine(data.toString());
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: Use data without over-writing its value */
            IO.writeLine(data.toString());

        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second private_five==5 to private_five!=5 */
    private void goodB2G1() throws Throwable
    {
        StringBuilder data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(private_five==5)
        {
            /* POTENTIAL FLAW: Initialize, but do not use data */
            data = new StringBuilder("Good");
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: Initialize and use data before it is overwritten */
            data = new StringBuilder("Good");

            IO.writeLine(data.toString());

        }
        /* INCIDENTAL: CWE 570 Statement is Always False */
        if(private_five!=5)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
            data = new StringBuilder("Reinitialize");
            IO.writeLine(data.toString());
        }
        else {

            /* FIX: Use data without over-writing its value */
            IO.writeLine(data.toString());

        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    private void goodB2G2() throws Throwable
    {
        StringBuilder data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(private_five==5)
        {
            /* POTENTIAL FLAW: Initialize, but do not use data */
            data = new StringBuilder("Good");
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: Initialize and use data before it is overwritten */
            data = new StringBuilder("Good");

            IO.writeLine(data.toString());

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(private_five==5)
        {
            /* FIX: Use data without over-writing its value */
            IO.writeLine(data.toString());
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
            data = new StringBuilder("Reinitialize");

            IO.writeLine(data.toString());

        }
    }

    public void good() throws Throwable
    {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
