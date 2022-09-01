package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bdm  reason: default package */
/* loaded from: classes.dex */
public final class bdm implements bdn {
    private final /* synthetic */ int a;

    public bdm(int i) {
        this.a = i;
    }

    @Override // defpackage.bdn
    public final atw a(atb atbVar, bdi bdiVar, bdp bdpVar, Context context) {
        return this.a != 0 ? new bnz(atbVar, bdiVar, bdpVar, context) : new atw(atbVar, bdiVar, bdpVar, context);
    }
}
