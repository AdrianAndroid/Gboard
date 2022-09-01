package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: gbq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gbq implements FileFilter {
    private final /* synthetic */ int h;
    public static final /* synthetic */ gbq g = new gbq(6);
    public static final /* synthetic */ gbq f = new gbq(5);
    public static final /* synthetic */ gbq e = new gbq(4);
    public static final /* synthetic */ gbq d = new gbq(3);
    public static final /* synthetic */ gbq c = new gbq(2);
    public static final /* synthetic */ gbq b = new gbq(1);
    public static final /* synthetic */ gbq a = new gbq(0);

    private /* synthetic */ gbq(int i) {
        this.h = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = this.h;
        if (i == 0) {
            return gbx.a.matcher(file.getName()).matches() || gbx.b.matcher(file.getName()).matches() || gbx.c.matcher(file.getName()).matches();
        } else if (i == 1) {
            Pattern pattern = bzw.a;
            if (!file.isDirectory()) {
                return bzw.a.matcher(file.getName()).matches();
            }
            return false;
        } else if (i == 2) {
            return file.getName().startsWith("restore_tmp_");
        } else {
            if (i == 3) {
                return file.getName().startsWith("backup_tmp_");
            }
            if (i == 4) {
                ltg ltgVar = gwj.a;
                return file.getName().startsWith("keyboardsnapshotcache_") && file.isFile();
            } else if (i == 5) {
                ltg ltgVar2 = gwj.a;
                return file.getName().startsWith("stylesheet_") && file.isFile();
            } else {
                long j = lbs.a;
                return file.getName().endsWith(".apk");
            }
        }
    }
}
