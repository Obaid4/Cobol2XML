package JunitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ cobolClass.class, NumTest.class, ParserTest.class, SymbolTest.class, TokenTest.class, wordTest.class })
public class AllTests {

}
