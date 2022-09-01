package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* renamed from: abv  reason: default package */
/* loaded from: classes.dex */
public final class abv extends InputConnectionWrapper {
    final /* synthetic */ opu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abv(InputConnection inputConnection, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(inputConnection, false);
        this.a = opuVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        opu opuVar = this.a;
        aqq aqqVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            aqqVar = new aqq((aca) new aby(inputContentInfo));
        }
        if (opuVar.J(aqqVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
