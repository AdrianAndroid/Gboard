package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* renamed from: abx  reason: default package */
/* loaded from: classes.dex */
public final class abx {
    public static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i, bundle);
    }
}
