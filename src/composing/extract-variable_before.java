void renderBanner() {


final bool isIe = (browser.toUpperCase().indexOf("IE") > -1);
final bool isInitial=wasInitialized();
final bool isMac=(platform.toUpperCase().indexOf("MAC") > -1);
final bool isRisize=resize > 0;

if (isMac && isIe && isInitial&& isRisize )
  {
    // do something
  }
}