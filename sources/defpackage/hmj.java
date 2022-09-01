package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PG */
/* renamed from: hmj  reason: default package */
/* loaded from: classes.dex */
public final class hmj extends Handler {
    public WeakReference a;

    public hmj() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractAsyncIme abstractAsyncIme;
        WeakReference weakReference = this.a;
        if (weakReference == null || (abstractAsyncIme = (AbstractAsyncIme) weakReference.get()) == null) {
            return;
        }
        if (!abstractAsyncIme.k(message.arg1)) {
            if (message.what != 100) {
                abstractAsyncIme.d(message);
            } else {
                for (Message message2 : (List) message.obj) {
                    abstractAsyncIme.d(message2);
                }
            }
        }
        hmz.k(message);
    }
}
