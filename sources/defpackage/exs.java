package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* renamed from: exs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class exs implements FilenameFilter {
    private final /* synthetic */ int f;
    public static final /* synthetic */ exs e = new exs(4);
    public static final /* synthetic */ exs d = new exs(3);
    public static final /* synthetic */ exs c = new exs(2);
    public static final /* synthetic */ exs b = new exs(1);
    public static final /* synthetic */ exs a = new exs(0);

    private /* synthetic */ exs(int i) {
        this.f = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.f;
        if (i == 0) {
            return str.endsWith("train_resumption_point.pb") || str.endsWith("test_resumption_point.pb");
        } else if (i == 1) {
            return str.startsWith("user_theme_");
        } else {
            if (i == 2) {
                return jbs.c(str).endsWith(".tflite");
            }
            if (i == 3) {
                ltg ltgVar = feb.a;
                return str.endsWith(".tflite");
            }
            int i2 = jur.a;
            return file.isDirectory();
        }
    }
}
