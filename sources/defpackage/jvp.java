package defpackage;

import java.io.File;
import java.io.FileFilter;

/* compiled from: PG */
/* renamed from: jvp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jvp implements FileFilter {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ jvp(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public jvp(String str, int i, byte[] bArr) {
        this.b = i;
        this.a = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (this.b != 0) {
            String name = file.getName();
            return file.isDirectory() && name.startsWith("temp_lib_") && !name.startsWith(this.a);
        }
        String str = this.a;
        int i = jvr.o;
        return file.getName().startsWith(str);
    }
}
