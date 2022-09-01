package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.system.Os;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kvj  reason: default package */
/* loaded from: classes.dex */
public class kvj {
    public static float a(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static PorterDuff.Mode b(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static boolean c(View view) {
        return aad.f(view) == 1;
    }

    public static void d(Window window, boolean z) {
        ((uc) tw.e(window, window.getDecorView()).a).e(z);
    }

    public static Drawable e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                wf.h(drawable, mode);
            }
        }
        return drawable;
    }

    public static int[] f(int[] iArr) {
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i < length) {
                int i2 = iArr[i];
                if (i2 == 16842912) {
                    return iArr;
                }
                if (i2 == 0) {
                    int[] iArr2 = (int[]) iArr.clone();
                    iArr2[i] = 16842912;
                    return iArr2;
                }
                i++;
            } else {
                int[] copyOf = Arrays.copyOf(iArr, length + 1);
                copyOf[length] = 16842912;
                return copyOf;
            }
        }
    }

    public static Uri g(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static IOException i(kcq kcqVar, Uri uri, IOException iOException) {
        try {
            kpm b = kpm.b();
            b.c();
            File file = (File) kcqVar.q(uri, b);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return k(file, iOException);
                        }
                        return k(file, iOException);
                    } else if (file.canWrite()) {
                        return k(file, iOException);
                    } else {
                        return k(file, iOException);
                    }
                } else if (file.canRead()) {
                    if (file.canWrite()) {
                        return k(file, iOException);
                    }
                    return k(file, iOException);
                } else if (file.canWrite()) {
                    return k(file, iOException);
                } else {
                    return k(file, iOException);
                }
            }
            return k(file, iOException);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    private static IOException j(File file, IOException iOException) {
        String concat;
        try {
            String str = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()));
            try {
                concat = str + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = "Inoperable file:".concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    private static IOException k(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return j(file, iOException);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return j(file, iOException);
                    }
                    return j(file, iOException);
                } else if (parentFile.canWrite()) {
                    return j(file, iOException);
                } else {
                    return j(file, iOException);
                }
            } else if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return j(file, iOException);
                }
                return j(file, iOException);
            } else if (parentFile.canWrite()) {
                return j(file, iOException);
            } else {
                return j(file, iOException);
            }
        }
        return j(file, iOException);
    }
}
