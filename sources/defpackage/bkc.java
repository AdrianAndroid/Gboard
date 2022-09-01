package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: bkc  reason: default package */
/* loaded from: classes.dex */
public final class bkc {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public bkc() {
    }

    public bkc(Context context, XmlPullParser xmlPullParser) {
        this.c = new ArrayList();
        this.b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tl.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(0, this.a);
            } else if (index == 1) {
                this.b = obtainStyledAttributes.getResourceId(1, this.b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.b);
                context.getResources().getResourceName(this.b);
                if ("layout".equals(resourceTypeName)) {
                    th thVar = new th();
                    this.d = thVar;
                    thVar.e(context, this.b);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static final boolean s(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final float a(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        p();
        return b();
    }

    public final float b() {
        Object obj = this.d;
        bgx bgxVar = (bgx) obj;
        float a = bgxVar.a((String) this.c, this.a, this.b);
        if (!Float.isNaN(a)) {
            this.a = ((bgx) this.d).a;
        }
        return a;
    }

    public final float c() {
        p();
        Object obj = this.d;
        bgx bgxVar = (bgx) obj;
        float a = bgxVar.a((String) this.c, this.a, this.b);
        if (!Float.isNaN(a)) {
            this.a = ((bgx) this.d).a;
        }
        return a;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.b;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.a = i3;
        if (i3 >= i2) {
            return -1;
        }
        return ((String) this.c).charAt(i3);
    }

    public final bho e() {
        float b = b();
        if (Float.isNaN(b)) {
            return null;
        }
        int q = q();
        return q == 0 ? new bho(b, 1) : new bho(b, q);
    }

    public final Boolean f(Object obj) {
        if (obj == null) {
            return null;
        }
        p();
        int i = this.a;
        if (i != this.b) {
            char charAt = ((String) this.c).charAt(i);
            if (charAt != '0') {
                if (charAt == '1') {
                    charAt = '1';
                }
            }
            boolean z = true;
            this.a++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public final Integer g() {
        int i = this.a;
        if (i == this.b) {
            return null;
        }
        Object obj = this.c;
        this.a = i + 1;
        return Integer.valueOf(((String) obj).charAt(i));
    }

    public final String h() {
        if (n()) {
            return null;
        }
        int i = this.a;
        char charAt = ((String) this.c).charAt(i);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int d = d();
        while (d != -1) {
            if (d != charAt) {
                d = d();
            } else {
                int i2 = this.a + 1;
                this.a = i2;
                return ((String) this.c).substring(i + 1, i2 - 1);
            }
        }
        this.a = i;
        return null;
    }

    public final String i() {
        return j(' ');
    }

    public final String j(char c) {
        if (n()) {
            return null;
        }
        char charAt = ((String) this.c).charAt(this.a);
        if (s(charAt) || charAt == c) {
            return null;
        }
        int i = this.a;
        int d = d();
        while (d != -1 && d != c && !s(d)) {
            d = d();
        }
        return ((String) this.c).substring(i, this.a);
    }

    public final void k() {
        while (true) {
            int i = this.a;
            if (i >= this.b || !s(((String) this.c).charAt(i))) {
                return;
            }
            this.a++;
        }
    }

    public final boolean l(char c) {
        int i = this.a;
        boolean z = false;
        if (i < this.b && ((String) this.c).charAt(i) == c) {
            z = true;
        }
        if (z) {
            this.a++;
        }
        return z;
    }

    public final boolean m(String str) {
        int length = str.length();
        int i = this.a;
        boolean z = false;
        if (i <= this.b - length && ((String) this.c).substring(i, i + length).equals(str)) {
            z = true;
        }
        if (z) {
            this.a += length;
        }
        return z;
    }

    public final boolean n() {
        return this.a == this.b;
    }

    public final boolean o() {
        int i = this.a;
        if (i == this.b) {
            return false;
        }
        char charAt = ((String) this.c).charAt(i);
        return (charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z');
    }

    public final boolean p() {
        k();
        int i = this.a;
        if (i != this.b && ((String) this.c).charAt(i) == ',') {
            this.a++;
            k();
            return true;
        }
        return false;
    }

    public final int q() {
        if (n()) {
            return 0;
        }
        if (((String) this.c).charAt(this.a) == '%') {
            this.a++;
            return 9;
        }
        int i = this.a;
        if (i > this.b - 2) {
            return 0;
        }
        try {
            int l = ce.l(((String) this.c).substring(i, i + 2).toLowerCase(Locale.US));
            this.a += 2;
            return l;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public final String r() {
        int i;
        int i2;
        int i3;
        if (n()) {
            i3 = this.a;
            i2 = i3;
        } else {
            int i4 = this.a;
            int charAt = ((String) this.c).charAt(i4);
            if (charAt == 45) {
                charAt = d();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i4;
            } else {
                int d = d();
                while (true) {
                    if ((d < 65 || d > 90) && ((d < 97 || d > 122) && !((d >= 48 && d <= 57) || d == 45 || d == 95))) {
                        break;
                    }
                    d = d();
                }
                i = this.a;
            }
            this.a = i4;
            int i5 = i;
            i2 = i4;
            i3 = i5;
        }
        if (i3 == i2) {
            return null;
        }
        String substring = ((String) this.c).substring(i2, i3);
        this.a = i3;
        return substring;
    }

    public bkc(String str, byte[] bArr) {
        this(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public bkc(String str) {
        this.a = 0;
        this.b = 0;
        this.d = new bgx();
        String trim = str.trim();
        this.c = trim;
        this.b = trim.length();
    }
}
