package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bgv  reason: default package */
/* loaded from: classes.dex */
public final class bgv {
    public final String a;
    public List b = null;
    public List c = null;
    public final int d;

    public bgv(int i, String str) {
        this.d = i == 0 ? 1 : i;
        this.a = str;
    }

    public final void a(String str, int i, String str2) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(new nwo(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.a;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        List<nwo> list = this.b;
        if (list != null) {
            for (nwo nwoVar : list) {
                sb.append('[');
                sb.append((String) nwoVar.b);
                int i2 = nwoVar.a - 1;
                if (i2 == 1) {
                    sb.append('=');
                    sb.append((String) nwoVar.c);
                } else if (i2 == 2) {
                    sb.append("~=");
                    sb.append((String) nwoVar.c);
                } else if (i2 == 3) {
                    sb.append("|=");
                    sb.append((String) nwoVar.c);
                }
                sb.append(']');
            }
        }
        List<String> list2 = this.c;
        if (list2 != null) {
            for (String str2 : list2) {
                sb.append(':');
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
