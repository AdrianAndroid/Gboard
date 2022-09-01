package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;

/* compiled from: PG */
/* renamed from: cao  reason: default package */
/* loaded from: classes.dex */
public final class cao extends gxu {
    final /* synthetic */ boolean a;
    final /* synthetic */ Delight5Facilitator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cao(Delight5Facilitator delight5Facilitator, boolean z) {
        super("check-main-lm");
        this.b = delight5Facilitator;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Delight5Facilitator delight5Facilitator = this.b;
        caj cajVar = delight5Facilitator.h;
        cajVar.h.hP(new cah(cajVar, this.a, new opu(delight5Facilitator), 0, null, null, null, null, null));
    }
}
