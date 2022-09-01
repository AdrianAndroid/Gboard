package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: clk  reason: default package */
/* loaded from: classes.dex */
public final class clk {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentMappingManager");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File a(Context context) {
        return new File(context.getFilesDir(), "contentsuggestion");
    }

    public static File b(Context context) {
        return new File(a(context), "keyword_images_mapping");
    }
}
