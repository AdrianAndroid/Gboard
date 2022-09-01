package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: jtl  reason: default package */
/* loaded from: classes.dex */
final class jtl implements jtk {
    private final List a;

    public jtl(List list) {
        this.a = list;
    }

    @Override // defpackage.jtk
    public final String a(int i) {
        Object obj = this.a.get(i);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
