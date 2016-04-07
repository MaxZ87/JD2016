<?xml version="1.0" encoding="utf-8" ?>
        <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                        xmlns:xls="http://www.w3.org/1999/XSL/Transform">
            <xsl:output method="html"/>
            <xsl:template match="/notebook">
       <table botder="1">
                <tr><td>birthday</td></tr><tr><td>address</td></tr><tr><td>phone</td></tr>
                <xls:apply-templates/>
            </table>
    </xsl:template>

           <xsl:template match="/notebook/name">
        <tr>xls:apply-templates</tr>
    </xsl:template>


            <xsl:template match="/notebook/name/birthday">
        <tr>xls:apply-templates</tr>
   </xsl:template>

           <xsl:template match="/notebook/name/address">
        <tr>xls:apply-templates</tr>
  </xsl:template>


            <xsl:template match="/notebook/name/phone">
        <tr>xls:apply-templates</tr>
    </xsl:template>
        </xsl:stylesheet>