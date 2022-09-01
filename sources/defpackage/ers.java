package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: PG */
/* renamed from: ers  reason: default package */
/* loaded from: classes.dex */
final class ers extends lym {
    private final File a;
    private final ZipEntry b;

    public ers(File file, ZipEntry zipEntry) {
        this.a = file;
        this.b = zipEntry;
    }

    @Override // defpackage.lym
    public final InputStream a() {
        ZipFile zipFile = new ZipFile(this.a);
        try {
            InputStream inputStream = zipFile.getInputStream(this.b);
            if (inputStream == null) {
                zipFile.close();
                throw new IOException(String.format("Could not open stream: file = %s, entry = %s", this.a, this.b));
            }
            return new err(inputStream, zipFile);
        } catch (IOException e) {
            zipFile.close();
            throw e;
        }
    }
}
