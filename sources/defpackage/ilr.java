package defpackage;

import android.content.Context;
import com.google.android.libraries.inputmethod.popup.MaterialRectangularPopupView;

/* compiled from: PG */
/* renamed from: ilr  reason: default package */
/* loaded from: classes.dex */
final class ilr extends imb {
    final /* synthetic */ MaterialRectangularPopupView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilr(MaterialRectangularPopupView materialRectangularPopupView, Context context, ilz ilzVar) {
        super(context, ilzVar);
        this.a = materialRectangularPopupView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.imb
    public final int a() {
        return this.a.a.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.imb
    public final int b() {
        return this.a.a.c;
    }
}
