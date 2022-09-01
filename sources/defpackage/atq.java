package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atq  reason: default package */
/* loaded from: classes.dex */
public final class atq implements bgd {
    final /* synthetic */ atb a;
    final /* synthetic */ List b;
    final /* synthetic */ bed c;
    private boolean d;

    public atq(atb atbVar, List list, bed bedVar) {
        this.a = atbVar;
        this.b = list;
        this.c = bedVar;
    }

    @Override // defpackage.bgd
    public final /* bridge */ /* synthetic */ Object a() {
        baq baqVar;
        avc bbrVar;
        bci bciVar;
        if (this.d) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        this.d = true;
        atb atbVar = this.a;
        List list = this.b;
        bed bedVar = this.c;
        axp axpVar = atbVar.a;
        axn axnVar = atbVar.c;
        Context applicationContext = atbVar.b.getApplicationContext();
        aqr aqrVar = atbVar.b.f;
        bmf bmfVar = new bmf();
        bmfVar.k(new baw());
        if (Build.VERSION.SDK_INT >= 27) {
            bmfVar.k(new bbi());
        }
        Resources resources = applicationContext.getResources();
        List c = bmfVar.c();
        bci bciVar2 = new bci(applicationContext, c, axpVar, axnVar);
        bbz bbzVar = new bbz(axpVar, new bbw(2));
        bbe bbeVar = new bbe(bmfVar.c(), resources.getDisplayMetrics(), axpVar, axnVar);
        if (Build.VERSION.SDK_INT < 28 || !aqrVar.a(atc.class)) {
            baqVar = new baq(bbeVar, 1);
            bbrVar = new bbr(bbeVar, axnVar, 0);
        } else {
            bbrVar = new baq(2, (byte[]) null);
            baqVar = new baq(0);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            bciVar = bciVar2;
            bmfVar.i("Animation", InputStream.class, Drawable.class, new baq(new bek(c, axnVar), 5, null, null, null));
            bmfVar.i("Animation", ByteBuffer.class, Drawable.class, new baq(new bek(c, axnVar), 4, null, null, null));
        } else {
            bciVar = bciVar2;
        }
        bcg bcgVar = new bcg(applicationContext);
        azu azuVar = new azu(resources, 3);
        azu azuVar2 = new azu(resources, 4);
        azu azuVar3 = new azu(resources, 2);
        azu azuVar4 = new azu(resources, 0);
        ban banVar = new ban(axnVar);
        bct bctVar = new bct(1);
        bcw bcwVar = new bcw(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        bmfVar.e(ByteBuffer.class, new ayw());
        bmfVar.e(InputStream.class, new azw(axnVar));
        bmfVar.i("Bitmap", ByteBuffer.class, Bitmap.class, baqVar);
        bmfVar.i("Bitmap", InputStream.class, Bitmap.class, bbrVar);
        if (avx.d()) {
            bmfVar.i("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new baq(bbeVar, 3));
        }
        bmfVar.i("Bitmap", ParcelFileDescriptor.class, Bitmap.class, bbzVar);
        bmfVar.i("Bitmap", AssetFileDescriptor.class, Bitmap.class, new bbz(axpVar, new bbw(1)));
        bmfVar.h(Bitmap.class, Bitmap.class, bab.a);
        bmfVar.i("Bitmap", Bitmap.class, Bitmap.class, new bch(1));
        bmfVar.f(Bitmap.class, banVar);
        bmfVar.i("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new bal(resources, baqVar));
        bmfVar.i("BitmapDrawable", InputStream.class, BitmapDrawable.class, new bal(resources, bbrVar));
        bmfVar.i("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new bal(resources, bbzVar));
        bmfVar.f(BitmapDrawable.class, new bam(axpVar, banVar));
        bci bciVar3 = bciVar;
        bmfVar.i("Animation", InputStream.class, bck.class, new bcs(c, bciVar3, axnVar));
        bmfVar.i("Animation", ByteBuffer.class, bck.class, bciVar3);
        bmfVar.f(bck.class, new bcl());
        bmfVar.h(aug.class, aug.class, bab.a);
        bmfVar.i("Bitmap", aug.class, Bitmap.class, new baq(axpVar, 6));
        bmfVar.g(Uri.class, Drawable.class, bcgVar);
        bmfVar.g(Uri.class, Bitmap.class, new bbr(bcgVar, axpVar, 1));
        bmfVar.l(new bca());
        bmfVar.h(File.class, ByteBuffer.class, new ayv(2));
        bmfVar.h(File.class, InputStream.class, new ayz(new azc(0), 0));
        bmfVar.g(File.class, File.class, new bch(2));
        bmfVar.h(File.class, ParcelFileDescriptor.class, new ayz(new azc(1), 0));
        bmfVar.h(File.class, File.class, bab.a);
        bmfVar.l(new avt(axnVar));
        if (avx.d()) {
            bmfVar.l(new avw());
        }
        bmfVar.h(Integer.TYPE, InputStream.class, azuVar);
        bmfVar.h(Integer.TYPE, ParcelFileDescriptor.class, azuVar3);
        bmfVar.h(Integer.class, InputStream.class, azuVar);
        bmfVar.h(Integer.class, ParcelFileDescriptor.class, azuVar3);
        bmfVar.h(Integer.class, Uri.class, azuVar2);
        bmfVar.h(Integer.TYPE, AssetFileDescriptor.class, azuVar4);
        bmfVar.h(Integer.class, AssetFileDescriptor.class, azuVar4);
        bmfVar.h(Integer.TYPE, Uri.class, azuVar2);
        bmfVar.h(String.class, InputStream.class, new ayz(1, (byte[]) null));
        bmfVar.h(Uri.class, InputStream.class, new ayz(1, (byte[]) null));
        bmfVar.h(String.class, InputStream.class, new ayv(5));
        bmfVar.h(String.class, ParcelFileDescriptor.class, new ayv(4));
        bmfVar.h(String.class, AssetFileDescriptor.class, new ayv(3));
        bmfVar.h(Uri.class, InputStream.class, new ayr(applicationContext.getAssets(), 0));
        bmfVar.h(Uri.class, AssetFileDescriptor.class, new ayr(applicationContext.getAssets(), 1));
        bmfVar.h(Uri.class, InputStream.class, new azu(applicationContext, 6));
        bmfVar.h(Uri.class, InputStream.class, new azu(applicationContext, 7));
        if (Build.VERSION.SDK_INT >= 29) {
            bmfVar.h(Uri.class, InputStream.class, new bae(applicationContext, InputStream.class));
            bmfVar.h(Uri.class, ParcelFileDescriptor.class, new bae(applicationContext, ParcelFileDescriptor.class));
        }
        bmfVar.h(Uri.class, InputStream.class, new azy(contentResolver, 2));
        bmfVar.h(Uri.class, ParcelFileDescriptor.class, new azy(contentResolver, 0));
        bmfVar.h(Uri.class, AssetFileDescriptor.class, new azy(contentResolver, 1));
        bmfVar.h(Uri.class, InputStream.class, new bab(0));
        bmfVar.h(URL.class, InputStream.class, new bab(2));
        bmfVar.h(Uri.class, File.class, new azu(applicationContext, 1));
        bmfVar.h(aze.class, InputStream.class, new azu(5));
        bmfVar.h(byte[].class, ByteBuffer.class, new ayv(1));
        bmfVar.h(byte[].class, InputStream.class, new ayv(0));
        bmfVar.h(Uri.class, Uri.class, bab.a);
        bmfVar.h(Drawable.class, Drawable.class, bab.a);
        bmfVar.g(Drawable.class, Drawable.class, new bch(0));
        bmfVar.m(Bitmap.class, BitmapDrawable.class, new bct(resources, 0));
        bmfVar.m(Bitmap.class, byte[].class, bctVar);
        bmfVar.m(Drawable.class, byte[].class, new bcu(axpVar, bctVar, bcwVar));
        bmfVar.m(bck.class, byte[].class, bcwVar);
        bbz bbzVar2 = new bbz(axpVar, new bbw(0));
        bmfVar.g(ByteBuffer.class, Bitmap.class, bbzVar2);
        bmfVar.g(ByteBuffer.class, BitmapDrawable.class, new bal(resources, bbzVar2));
        yo.d(applicationContext, bmfVar, list, bedVar);
        return bmfVar;
    }
}
