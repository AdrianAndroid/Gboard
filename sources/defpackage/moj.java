package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: moj  reason: default package */
/* loaded from: classes2.dex */
public final class moj implements moo {
    private final String a;
    private final mok b;

    public moj(Set set, mok mokVar) {
        this.a = b(set);
        this.b = mokVar;
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            mol molVar = (mol) it.next();
            sb.append(molVar.a);
            sb.append('/');
            sb.append(molVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.moo
    public final String a() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        String str = this.a;
        String b = b(this.b.a());
        return str + " " + b;
    }
}
