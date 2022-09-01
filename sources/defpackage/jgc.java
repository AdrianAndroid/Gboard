package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: jgc  reason: default package */
/* loaded from: classes.dex */
public final class jgc implements XmlResourceParser {
    private final Stack a;
    private final Stack b;
    private XmlResourceParser c;
    private final Context d;
    private final Map e = lre.q();
    private final Map f = lre.q();

    static {
        lug lugVar = hin.a;
    }

    public jgc(Context context, int i) {
        Stack stack = new Stack();
        this.a = stack;
        Stack stack2 = new Stack();
        this.b = stack2;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                this.d = context;
                stack.push(xml);
                stack2.push(Integer.valueOf(i));
                this.c = xml;
                return;
            } catch (Resources.NotFoundException e) {
                jgd.m(e, context, i);
                throw e;
            }
        }
        throw new IllegalArgumentException();
    }

    private final void a() {
        while (this.a.size() > 1) {
            ((XmlResourceParser) this.a.pop()).close();
            this.b.pop();
        }
        this.c = (XmlResourceParser) this.a.peek();
    }

    private final boolean b() {
        return this.a.size() > 1;
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public final void close() {
        a();
        this.c.close();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void defineEntityReplacementText(String str, String str2) {
        this.c.defineEntityReplacementText(str, str2);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(int i, boolean z) {
        return jgd.n(this.d, this.c, i, z);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final int getAttributeCount() {
        return this.c.getAttributeCount();
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(int i, float f) {
        return jgd.a(this.d, this.c, i, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(int i, int i2) {
        return jgd.c(this.d, this.c, i, i2);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(int i, String[] strArr, int i2) {
        return this.c.getAttributeListValue(i, strArr, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeName(int i) {
        return this.c.getAttributeName(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeNameResource(int i) {
        return this.c.getAttributeNameResource(i);
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeNamespace(int i) {
        return this.c.getAttributeNamespace(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributePrefix(int i) {
        return this.c.getAttributePrefix(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(int i, int i2) {
        return jgd.e(this.d, this.c, i, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeType(int i) {
        return this.c.getAttributeType(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(int i, int i2) {
        return this.c.getAttributeUnsignedIntValue(i, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(int i) {
        return jgd.j(this.d, this.c, i);
    }

    @Override // android.util.AttributeSet
    public final String getClassAttribute() {
        return this.c.getClassAttribute();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getColumnNumber() {
        return this.c.getColumnNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getDepth() {
        int depth = ((XmlResourceParser) this.a.get(0)).getDepth();
        for (int i = 1; i < this.a.size(); i++) {
            int depth2 = ((XmlResourceParser) this.a.get(i)).getDepth();
            depth += depth2 > 1 ? depth2 - 2 : 0;
        }
        return depth;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.c.getEventType();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean getFeature(String str) {
        return this.c.getFeature(str);
    }

    @Override // android.util.AttributeSet
    public final String getIdAttribute() {
        return this.c.getIdAttribute();
    }

    @Override // android.util.AttributeSet
    public final int getIdAttributeResourceValue(int i) {
        return this.c.getIdAttributeResourceValue(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getInputEncoding() {
        return this.c.getInputEncoding();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getLineNumber() {
        return this.c.getLineNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        return this.c.getName();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace() {
        return this.c.getNamespace();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getNamespaceCount(int i) {
        return this.c.getNamespaceCount(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespacePrefix(int i) {
        return this.c.getNamespacePrefix(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespaceUri(int i) {
        return this.c.getNamespaceUri(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getPositionDescription() {
        ArrayList arrayList = new ArrayList(this.b.size());
        Stack stack = this.b;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(jbi.i(((Integer) stack.get(i)).intValue()));
        }
        return String.format(Locale.US, "file: %s, line: %d, tag: %s", lex.d("->").f(arrayList), Integer.valueOf(getLineNumber()), getName());
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPrefix() {
        return this.c.getPrefix();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final Object getProperty(String str) {
        return this.c.getProperty(str);
    }

    @Override // android.util.AttributeSet
    public final int getStyleAttribute() {
        return this.c.getStyleAttribute();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        return this.c.getText();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final char[] getTextCharacters(int[] iArr) {
        return this.c.getTextCharacters(iArr);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isAttributeDefault(int i) {
        return this.c.isAttributeDefault(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isEmptyElementTag() {
        return this.c.isEmptyElementTag();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isWhitespace() {
        return this.c.isWhitespace();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int next() {
        int next = this.c.next();
        if (next == 0) {
            return !b() ? next : next();
        } else if (next == 1) {
            if (!b()) {
                return next;
            }
            this.b.pop();
            this.c = (XmlResourceParser) this.a.peek();
            ((XmlResourceParser) this.a.pop()).close();
            return next();
        } else if (next != 2) {
            if (next != 3) {
                return next;
            }
            String name = this.c.getName();
            if ("include".equals(name)) {
                return next();
            }
            return (!"framework".equals(name) || !b()) ? next : next();
        } else {
            String name2 = getName();
            if (!"include".equals(name2)) {
                return (!"framework".equals(name2) || !b()) ? next : next();
            }
            int attributeResourceValue = this.c.getAttributeResourceValue(null, "href", 0);
            if (attributeResourceValue != 0) {
                try {
                    XmlResourceParser xml = this.d.getResources().getXml(attributeResourceValue);
                    for (String str : this.e.keySet()) {
                        xml.setFeature(str, ((Boolean) this.e.get(str)).booleanValue());
                    }
                    for (String str2 : this.f.keySet()) {
                        xml.setProperty(str2, this.f.get(str2));
                    }
                    this.a.push(xml);
                    this.b.push(Integer.valueOf(attributeResourceValue));
                    this.c = xml;
                } catch (Resources.NotFoundException unused) {
                }
            }
            return next();
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextTag() {
        int next = next();
        if (next == 4) {
            next = isWhitespace() ? next() : 4;
        }
        if (next == 2 || next == 3) {
            return next;
        }
        throw new XmlPullParserException(String.valueOf(getPositionDescription()).concat(": expected start or end tag"), this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() {
        if (getEventType() != 2) {
            throw new XmlPullParserException(String.valueOf(getPositionDescription()).concat(": parser must be on START_TAG to read next text"), this, null);
        }
        int next = next();
        if (next != 4) {
            if (next != 3) {
                throw new XmlPullParserException(String.valueOf(getPositionDescription()).concat(": parser must be on START_TAG or TEXT to read text"), this, null);
            }
            return "";
        }
        String text = getText();
        if (next() != 3) {
            throw new XmlPullParserException(String.valueOf(getPositionDescription()).concat(": event TEXT it must be immediately followed by END_TAG"), this, null);
        }
        return text;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextToken() {
        return next();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void require(int i, String str, String str2) {
        this.c.require(i, str, str2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setFeature(String str, boolean z) {
        this.e.put(str, Boolean.valueOf(z));
        Stack stack = this.a;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            ((XmlResourceParser) stack.get(i)).setFeature(str, z);
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(InputStream inputStream, String str) {
        ((XmlResourceParser) this.a.firstElement()).setInput(inputStream, str);
        a();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setProperty(String str, Object obj) {
        this.f.put(str, obj);
        Stack stack = this.a;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            ((XmlResourceParser) stack.get(i)).setProperty(str, obj);
        }
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        return jgd.o(this.d, this.c, str, str2, z);
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(String str, String str2, float f) {
        return jgd.b(this.d, this.c, str, str2, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(String str, String str2, int i) {
        return jgd.d(this.d, this.c, str, str2, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return this.c.getAttributeListValue(str, str2, strArr, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(String str, String str2, int i) {
        return jgd.f(this.d, this.c, str, str2, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(String str, String str2, int i) {
        return this.c.getAttributeUnsignedIntValue(str, str2, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(String str, String str2) {
        return jgd.k(this.d, this.c, str, str2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace(String str) {
        return this.c.getNamespace(str);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(Reader reader) {
        ((XmlResourceParser) this.a.firstElement()).setInput(reader);
        a();
    }
}
