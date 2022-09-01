package defpackage;

import android.os.Build;
import android.view.HapticFeedbackConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jal  reason: default package */
/* loaded from: classes.dex */
public final class jal {
    static final Boolean a;

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT == 26) {
            try {
                jam.e = HapticFeedbackConstants.class.getField("TEXT_HANDLE_MOVE").getInt(null);
                jam.d = HapticFeedbackConstants.class.getField("VIRTUAL_KEY_RELEASE").getInt(null);
            } catch (Exception unused) {
            }
        } else {
            if (Build.VERSION.SDK_INT > 26) {
                jam.e = 9;
                jam.d = 7;
            }
            z = false;
        }
        ltg ltgVar = jam.a;
        a = Boolean.valueOf(z);
    }
}
