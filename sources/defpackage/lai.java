package defpackage;

import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* renamed from: lai  reason: default package */
/* loaded from: classes.dex */
final class lai implements lae {
    private final /* synthetic */ int a;

    public lai(int i) {
        this.a = i;
    }

    @Override // defpackage.lae
    public final boolean a(Object obj, File file, File file2) {
        Class<?> cls;
        int i = this.a;
        if (i == 0) {
            try {
                cls = Class.forName("dalvik.system.DexFile");
                try {
                } catch (Exception e) {
                    throw new lak(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e);
                }
            } catch (ClassNotFoundException unused) {
                Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            }
            return !((Boolean) Boolean.class.cast(lby.h(cls, "isDexOptNeeded", String.class).invoke(null, file.getPath()))).booleanValue();
        } else if (i != 1) {
            return true;
        } else {
            Class<?> cls2 = obj.getClass();
            try {
                return new File((String) String.class.cast(lby.h(cls2, "optimizedPathFor", File.class, File.class).invoke(null, file, file2))).exists();
            } catch (Exception e2) {
                throw new lak(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", cls2), e2);
            }
        }
    }
}
