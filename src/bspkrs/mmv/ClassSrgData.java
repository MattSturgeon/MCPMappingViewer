/*
 * Copyright (C) 2013 bspkrs
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation 
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, 
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO 
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, 
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package bspkrs.mmv;

public class ClassSrgData implements Comparable<ClassSrgData>
{
    private final String  obfName;
    private final String  srgName;
    private String        srgPkgName;
    private final boolean isClientOnly;
    
    public ClassSrgData(String obfName, String srgName, String srgPkgName, boolean isClientOnly)
    {
        this.obfName = obfName;
        this.srgName = srgName;
        this.srgPkgName = srgPkgName;
        this.isClientOnly = isClientOnly;
    }
    
    public String getObfName()
    {
        return this.obfName;
    }
    
    public String getSrgName()
    {
        return this.srgName;
    }
    
    public String getSrgPkgName()
    {
        return this.srgPkgName;
    }
    
    public ClassSrgData setSrgPkgName(String pkg)
    {
        this.srgPkgName = pkg;
        return this;
    }
    
    public boolean isClientOnly()
    {
        return isClientOnly;
    }
    
    public String getFullyQualifiedSrgName()
    {
        return srgPkgName + "/" + srgName;
    }
    
    @Override
    public int compareTo(ClassSrgData o)
    {
        if (o != null)
            return getFullyQualifiedSrgName().compareToIgnoreCase(o.getFullyQualifiedSrgName());
        else
            return 1;
    }
}
