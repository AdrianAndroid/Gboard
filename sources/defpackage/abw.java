package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* compiled from: PG */
/* renamed from: abw  reason: default package */
/* loaded from: classes.dex */
public final class abw extends InputConnectionWrapper {
    final /* synthetic */ opu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abw(InputConnection inputConnection, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(inputConnection, false);
        this.a = opuVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z;
        ResultReceiver resultReceiver;
        opu opuVar = this.a;
        if (bundle != null) {
            boolean z2 = false;
            z2 = false;
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = true;
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    int i = bundle.getInt(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        z2 = opuVar.J(new aqq(uri, clipDescription, uri2), i, bundle2);
                    }
                    if (resultReceiver != null) {
                        int i2 = z2 ? 1 : 0;
                        int i3 = z2 ? 1 : 0;
                        int i4 = z2 ? 1 : 0;
                        resultReceiver.send(i2, null);
                    }
                    if (z2) {
                        return true;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        return super.performPrivateCommand(str, bundle);
    }
}
