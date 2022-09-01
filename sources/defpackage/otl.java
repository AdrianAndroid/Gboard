package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: otl  reason: default package */
/* loaded from: classes2.dex */
final class otl implements otm {
    @Override // defpackage.otm
    public final ovn a(File file) {
        try {
            return ovb.b(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return ovb.b(file);
        }
    }

    @Override // defpackage.otm
    public final void b(File file) {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(file))));
    }

    @Override // defpackage.otm
    public final void c(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: ".concat(String.valueOf(String.valueOf(file))));
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                c(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(file2))));
            }
        }
    }

    @Override // defpackage.otm
    public final void d(File file, File file2) {
        b(file2);
        if (file.renameTo(file2)) {
            return;
        }
        String valueOf = String.valueOf(file);
        String valueOf2 = String.valueOf(file2);
        throw new IOException("failed to rename " + valueOf + " to " + valueOf2);
    }
}
