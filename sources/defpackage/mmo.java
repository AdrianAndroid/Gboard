package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: mmo  reason: default package */
/* loaded from: classes2.dex */
abstract class mmo implements mms {
    @Override // defpackage.mms
    public Object a(Class cls) {
        moi c = c(cls);
        if (c == null) {
            return null;
        }
        return c.a();
    }

    @Override // defpackage.mms
    public Set b(Class cls) {
        throw null;
    }
}
