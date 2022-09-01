package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lul  reason: default package */
/* loaded from: classes.dex */
public final class lul implements ltx {
    private static final Set d = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    public final StringBuilder b;
    public boolean c = false;
    private final String e = "[CONTEXT ";
    public final String a = " ]";

    public lul(StringBuilder sb) {
        this.b = sb;
    }

    private static int b(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // defpackage.ltx
    public final void a(String str, Object obj) {
        char c = ' ';
        if (this.c) {
            this.b.append(' ');
        } else {
            if (this.b.length() > 0) {
                StringBuilder sb = this.b;
                if (sb.length() > 1000 || this.b.indexOf("\n") != -1) {
                    c = '\n';
                }
                sb.append(c);
            }
            this.b.append(this.e);
            this.c = true;
        }
        StringBuilder sb2 = this.b;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
        } else if (d.contains(obj.getClass())) {
            sb2.append(obj);
        } else {
            sb2.append('\"');
            String obj2 = obj.toString();
            int i = 0;
            while (true) {
                int b = b(obj2, i);
                if (b != -1) {
                    sb2.append((CharSequence) obj2, i, b);
                    i = b + 1;
                    char charAt = obj2.charAt(b);
                    if (charAt == '\t') {
                        charAt = 't';
                    } else if (charAt == '\n') {
                        charAt = 'n';
                    } else if (charAt == '\r') {
                        charAt = 'r';
                    } else if (charAt != '\"' && charAt != '\\') {
                        sb2.append((char) 65533);
                    }
                    sb2.append("\\");
                    sb2.append(charAt);
                } else {
                    sb2.append((CharSequence) obj2, i, obj2.length());
                    sb2.append('\"');
                    return;
                }
            }
        }
    }
}
