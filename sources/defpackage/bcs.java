package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: bcs  reason: default package */
/* loaded from: classes.dex */
public final class bcs implements avc {
    private final List a;
    private final avc b;
    private final axn c;

    public bcs(List list, avc avcVar, axn axnVar) {
        this.a = list;
        this.b = avcVar;
        this.c = axnVar;
    }

    @Override // defpackage.avc
    public final /* bridge */ /* synthetic */ axh a(Object obj, int i, int i2, ava avaVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i, i2, avaVar);
    }

    @Override // defpackage.avc
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ava avaVar) {
        return !((Boolean) avaVar.b(bcr.b)).booleanValue() && cf.j(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}
