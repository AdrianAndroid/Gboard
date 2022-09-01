package defpackage;

import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: bzy  reason: default package */
/* loaded from: classes.dex */
final class bzy {
    public final String a;
    public final String b;

    public bzy() {
    }

    public bzy(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static String a(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() == 4) {
            String text = xmlPullParser.getText();
            xmlPullParser.nextTag();
            return text;
        }
        return "";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzy) {
            bzy bzyVar = (bzy) obj;
            if (this.a.equals(bzyVar.a) && this.b.equals(bzyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return "Rule{regex=" + str + ", replacement=" + str2 + "}";
    }
}
