package defpackage;

import android.system.Os;
import java.io.FileDescriptor;

/* compiled from: PG */
/* renamed from: aeu  reason: default package */
/* loaded from: classes.dex */
final class aeu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, j, i);
    }

    static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    static void c(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }
}
