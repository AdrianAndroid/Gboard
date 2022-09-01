package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bgt  reason: default package */
/* loaded from: classes.dex */
public final class bgt {
    public List a = null;

    public final void a(bgt bgtVar) {
        List list = bgtVar.a;
        if (list == null) {
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList(list.size());
        }
        for (bgs bgsVar : bgtVar.a) {
            this.a.add(bgsVar);
        }
    }

    public final String toString() {
        if (this.a == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (bgs bgsVar : this.a) {
            sb.append(bgsVar.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
