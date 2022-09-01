package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lti  reason: default package */
/* loaded from: classes.dex */
final class lti extends lty {
    public lti(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.lty
    public final void a(Iterator it, ltx ltxVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                ltxVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            ltxVar.a(str, sb.toString());
        }
    }
}
