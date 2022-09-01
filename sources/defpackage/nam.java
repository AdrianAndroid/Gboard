package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nam  reason: default package */
/* loaded from: classes2.dex */
public enum nam implements nbd {
    UNION_ALL("UNION ALL"),
    UNION("UNION"),
    INTERSECT("INTERSECT"),
    EXCEPT("EXCEPT");
    
    private final llp f;

    nam(String str) {
        llp r = llp.r(str);
        oll.d(r, "of(token)");
        this.f = r;
    }

    @Override // defpackage.nbd
    public final /* synthetic */ List a() {
        return this.f;
    }
}
