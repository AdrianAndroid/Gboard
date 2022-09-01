package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: lqh  reason: default package */
/* loaded from: classes.dex */
enum lqh implements leq {
    KEY,
    VALUE;

    @Override // defpackage.leq
    public final /* synthetic */ Object a(Object obj) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw null;
            }
            return ((Map.Entry) obj).getValue();
        }
        return ((Map.Entry) obj).getKey();
    }
}
