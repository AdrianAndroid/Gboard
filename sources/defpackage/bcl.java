package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: bcl  reason: default package */
/* loaded from: classes.dex */
public final class bcl implements avd {
    @Override // defpackage.auo
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, ava avaVar) {
        try {
            bfw.e(((bck) ((axh) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // defpackage.avd
    public final int b() {
        return 1;
    }
}
