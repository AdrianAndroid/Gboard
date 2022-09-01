package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ltj  reason: default package */
/* loaded from: classes.dex */
final class ltj extends lty {
    public ltj(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.lty
    public final /* bridge */ /* synthetic */ void b(Object obj, ltx ltxVar) {
        for (Map.Entry entry : ((lwt) obj).c.d) {
            if (!((Set) entry.getValue()).isEmpty()) {
                for (Object obj2 : (Set) entry.getValue()) {
                    ltxVar.a((String) entry.getKey(), obj2);
                }
            } else {
                ltxVar.a((String) entry.getKey(), null);
            }
        }
    }
}
