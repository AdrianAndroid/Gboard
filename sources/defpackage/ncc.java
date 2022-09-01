package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: ncc  reason: default package */
/* loaded from: classes2.dex */
public enum ncc implements nbd {
    MINUS("-"),
    PLUS("+"),
    BITWISE_NEGATE("~"),
    NOT("NOT"),
    EXISTS("EXISTS");
    
    private final llp g;

    ncc(String str) {
        llp r = llp.r(str);
        oll.d(r, "of(token)");
        this.g = r;
    }

    @Override // defpackage.nbd
    public final /* synthetic */ List a() {
        return this.g;
    }
}
