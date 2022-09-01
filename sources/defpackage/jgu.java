package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* renamed from: jgu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jgu implements jgw {
    private final /* synthetic */ int c;
    public static final /* synthetic */ jgu b = new jgu(1);
    public static final /* synthetic */ jgu a = new jgu(0);

    private /* synthetic */ jgu(int i) {
        this.c = i;
    }

    @Override // defpackage.jgw
    public final boolean a(Activity activity) {
        if (this.c != 0) {
            return activity instanceof cx;
        }
        jgw jgwVar = jgx.a;
        return true;
    }
}
