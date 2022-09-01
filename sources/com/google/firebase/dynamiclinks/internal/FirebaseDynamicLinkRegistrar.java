package com.google.firebase.dynamiclinks.internal;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FirebaseDynamicLinkRegistrar implements mmu {
    public static /* synthetic */ mnl lambda$getComponents$0(mms mmsVar) {
        mmk mmkVar = (mmk) mmsVar.a(mmk.class);
        moi c = mmsVar.c(mmn.class);
        mmkVar.e();
        return new mnl(new mno(mmkVar.c), mmkVar, c);
    }

    @Override // defpackage.mmu
    public List getComponents() {
        mmq a = mmr.a(mnl.class);
        a.b(mmz.a(mmk.class));
        a.b(new mmz(mmn.class, 0, 1));
        a.c(mod.b);
        return Arrays.asList(a.a());
    }
}
